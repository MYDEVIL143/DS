import mpi.*;

public class MPISum {

    public static void main(String[] args) throws Exception {

        MPI.Init(args);

        int rank = MPI.COMM_WORLD.Rank();
        int size = MPI.COMM_WORLD.Size();

        int[] data = {1, 2, 3, 4, 5, 6, 7, 8};

        int chunk = data.length / size;

        int start = rank * chunk;
        int end = start + chunk;

        int localSum = 0;

        for (int i = start; i < end; i++) {
            localSum += data[i];
        }

        System.out.println("Process " + rank +
                " calculated sum = " + localSum);

        int[] globalSum = new int[1];

        MPI.COMM_WORLD.Reduce(
                new int[]{localSum},
                0,
                globalSum,
                0,
                1,
                MPI.INT,
                MPI.SUM,
                0
        );

        if (rank == 0) {
            System.out.println("Final Sum = " + globalSum[0]);
        }

        MPI.Finalize();
    }
}