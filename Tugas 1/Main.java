import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Bus bus = new Bus();
        Scanner input = new Scanner(System.in);
        int opsi;
        System.out.println("\n===== BUS TRANS KOETARADJA =====");
        String nama;
        int umur;
        String hamil;
        boolean status;
        while(true){
            System.out.println("Menu :");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang");
            System.out.println("4. Keluar\n");
            System.out.print("Pilihan : ");
            opsi = input.nextInt();
            System.out.println();
            input.nextLine();
            if(opsi==1){
                System.out.print("Nama       : ");
                nama = input.nextLine();
                System.out.print("Umur       : ");
                umur = input.nextInt();
                input.nextLine();
                System.out.print("Hamil(y/n) : ");
                hamil = input.nextLine();
                if(hamil.equalsIgnoreCase("y")){
                    status = true;
                }else{
                    status = false;
                }
                Penumpang pen = new Penumpang(nama, umur, status);
                System.out.println(bus.NaikPenumpang(pen) ? "Penumpang berhasil ditambahkan!":"Penumpang Gagal ditambahkan!");
            }else if(opsi==2){
                System.out.print("Nama       : ");
                nama = input.nextLine();
                System.out.println(bus.turunkanPenumpang(nama) ? "Penumpang berhasil Turun!":"Penumpang Tidak ditemukan!");
            }else if(opsi==3){
                System.out.println(bus.toString());
            }else if(opsi==4){
                System.out.println("Anda telah keluar dari program");
                System.exit(4);
            }else{
                System.out.println("Pilihlah sesuai dengan menu pilihan");
                System.exit(0);
            }

            System.out.println("============================\n");
        }
    }
}