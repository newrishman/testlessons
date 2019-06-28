public class MBIrbis {
    public static void main(String[] args) {

        Workers worker = new Mechanic();
        Workers worker1 = new Diagnostician();
        Workers worker2 = new GaranteeMan();

        workDay(worker);
        workDay(worker1);
        workDay(worker2);

        Mechanic mechanic = new Mechanic();
        Diagnostician diagnostician = new Diagnostician();
        GaranteeMan garanteeMan = new GaranteeMan();

        workDay(mechanic);
        workDay(diagnostician);
        workDay(garanteeMan);
    }

    public static void workDay(MBIrbisWorkers worker) {

        worker.works();
        worker.suffers();
        worker.sitting();
        worker.angry();
        worker.eating();
        worker.sleeping();
    }
}
