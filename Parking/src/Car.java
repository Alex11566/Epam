import java.util.concurrent.TimeUnit;

public class Car implements Runnable {
    private int numberCar;

    public Car (int numberCar){
        this.numberCar = numberCar;
    }

    @Override
    public void run() {
        System.out.printf("Авто %d ожидает разрешение на въезд. \n", numberCar);
        try {
            if (Parking.getSEMAPHORE().tryAcquire(10, TimeUnit.SECONDS)){
                int place = 0;
                synchronized (Parking.getPLACES()) {
                    for (Boolean status : Parking.getPLACES()
                    ) {

                        if (!status) {
                            Parking.getPLACES()[place] = true;
                            System.out.printf(">> Авто %d припарковался на место %d. \n", numberCar, place+1);
                            break;
                        }
                        place++;
                    }
                }
                TimeUnit.SECONDS.sleep((int) (Math.random() * 100));
                synchronized (Parking.getPLACES()) {
                    Parking.getPLACES()[place] = false;
                    Parking.getSEMAPHORE().release();
                }
                System.out.printf("<< Автомобиль №%d освободил место.\n", numberCar);
            }
            else {
                System.out.printf("<!> Автомобиль №%d не дождался.\n", numberCar);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
