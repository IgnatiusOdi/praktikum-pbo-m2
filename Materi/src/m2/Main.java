package m2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<User> user = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Scanner scanint = new Scanner(System.in);
        int menu;
        boolean boleh;
        String tempuser;
        String username, password, nama, toko, alamat;

        do{
            System.out.println("Login Tukupedia");
            System.out.print("Username : ");
            username = scan.nextLine();
            System.out.print("Password : ");
            password = scan.nextLine();
            if(username.equals("admin") && password.equals("password")){
                do{
                    System.out.println("Admin Tukupedia");
                    System.out.println("Hi Admin!");
                    System.out.println("1. Tambah Pembeli");
                    System.out.println("2. Tambah Penjual");
                    System.out.println("3. Tampilkan Semua User");
                    System.out.println("4. Exit");
                    System.out.print(">> ");
                    menu = scanint.nextInt();
                    if(menu==1){
                        System.out.println("Admin Tukupedia");
                        System.out.print("Username : ");
                        username = scan.nextLine();
                        System.out.print("Password : ");
                        password = scan.nextLine();
                        System.out.print("Nama : ");
                        nama = scan.nextLine();
                        System.out.print("Alamat : ");
                        alamat = scan.nextLine();
                        boleh = true;
                        for (int i = 0; i < user.size(); i++) {
                            if(user.get(i).getUsername().equals(username)){
                                boleh = false;
                            }
                        }
                        if(boleh){
                            System.out.println("Berhasil tambah pembeli");
                            user.add(new User(username, password, nama, "-", alamat, "Pembeli"));
                        } else{
                            System.out.println("Username sudah pernah dipakai sebelumnya");
                        }
                    }
                    else if(menu==2){
                        System.out.println("Admin Tukupedia");
                        System.out.print("Username : ");
                        username = scan.nextLine();
                        System.out.print("Password : ");
                        password = scan.nextLine();
                        System.out.print("Nama Penjual : ");
                        nama = scan.nextLine();
                        System.out.print("Nama Toko : ");
                        toko = scan.nextLine();
                        System.out.print("Alamat : ");
                        alamat = scan.nextLine();
                        boleh = true;
                        for (int i = 0; i < user.size(); i++) {
                            if(user.get(i).getUsername().equals(username)){
                                boleh = false;
                            }
                        }
                        if(boleh){
                            System.out.println("Berhasil tambah penjual");
                            user.add(new User(username, password, nama, toko, alamat, "Penjual"));
                        } else{
                            System.out.println("Username sudah pernah dipakai sebelumnya");
                        }
                    }
                    else if(menu==3){
                        System.out.println("Admin Tukupedia");
                        System.out.println("-List User-");
                        for (int i = 0; i < user.size(); i++) {
                            System.out.println((i+1)+". "+user.get(i).getNama()+" - "+user.get(i).getUsername()+" - "+user.get(i).getTipe());
                        }
                    }
                }while(menu!=4);
            } else{
                boleh = false;
                for (int i = 0; i < user.size(); i++) {
                    if (user.get(i).getUsername().equals(username)){
                        if(user.get(i).getPassword().equals(password)){
                            boleh = true;
                            tempuser = username;
                        }
                    }
                }
                if(boleh){
//                    do{
//                        System.out.println("Pembeli Tukupedia");
//                        System.out.println("Selamat datang "+tempuser+",");
//                        System.out.println("Saldo Anda : "+user.get(1).getSaldo());
//                    }while(menu!=2);
                } else{
                    System.out.println("Username tidak terdaftar!");
                }
            }
        }while(true);
    }
}
