package test;

import java.util.ArrayList;
import java.util.Scanner;
import model_1.GiaoVien;
import model_1.HocSinh;
import model_2.Bao;
import model_2.Sach;

public class Menu {

    public static void main(String[] args) {
        ArrayList<HocSinh> listHocSinh = new ArrayList<>();
        ArrayList<GiaoVien> listGiaoVien = new ArrayList<>();
        ArrayList<Sach> listSach = new ArrayList<>();
        ArrayList<Bao> listBao = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("_____MENU_____");
            System.out.println("1. Them hoc sinh vao trong lop hoc.");
            System.out.println("2. Them giao vien vao trong lop hoc.");
            System.out.println("3. Them sach vao thu vien.");
            System.out.println("4. Them bao vao thu vien.");
            System.out.println("5. In ra thong tin tat ca cac doi tuong.");
            System.out.println("6. In ra tat ca cac sach hoac bao co trong thu vien.");
            System.out.println("0. Thoat!!!");
            System.out.println("Nhap vao lua chon cua ban!!!");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addHocSinh(listHocSinh, sc);
                    break;
                case 2:
                    addGiaoVien(listGiaoVien, sc);
                    break;
                case 3:
                    addSach(listSach, sc);
                    break;
                case 4:
                    addBao(listBao, sc);
                    break;
                case 5:
                    printAllDoiTuong(listHocSinh, listGiaoVien);
                    break;
                case 6:
                    printSachOrBao(listSach, listBao, sc);
                    break;
                case 0:
                    System.out.println("Ban da thoat khoi menu!!!");
                    break;
                default:
                    System.out.println("Lua chon cua ban khong hop le.");
                    break;
            }
        } while (choice != 0);
    }

    public static void addHocSinh(ArrayList<HocSinh> listHocSinh, Scanner sc) {
        System.out.println("NHAP THONG TIN HOC SINH");

        System.out.print("Ma Hoc Sinh: ");
        String maDoiTuong = sc.nextLine();
        for (HocSinh i : listHocSinh) {
            if (i.getMaDoiTuong().equals(maDoiTuong)) {
                System.out.println("Ma doi tuong da ton tai trong danh sach!!!");
                return;
            }
        }
        System.out.print("Ho Va Ten: ");
        String tenDoiTuong = sc.nextLine();
        System.out.print("Gioi Tinh (Nam: False / Nu: True): ");
        boolean gioiTinh = sc.nextBoolean();
        sc.nextLine();
        System.out.print("Nam Sinh: ");
        String namSinh = sc.nextLine();
        System.out.print("Lop: ");
        String lop = sc.nextLine();
        System.out.print("Ban: ");
        String ban = sc.nextLine();

        listHocSinh.add(new HocSinh(lop, ban, maDoiTuong, tenDoiTuong, namSinh, gioiTinh));
        System.out.println("SINH VIEN DA DUOC THEM VAO THANH CONG!!!");
    }

    public static void addGiaoVien(ArrayList<GiaoVien> listGiaoVien, Scanner sc) {
        System.out.println("NHAP THONG TIN GIAO VIEN");

        System.out.print("Ma Giao Vien: ");
        String maDoiTuong = sc.nextLine();
        for (GiaoVien i : listGiaoVien) {
            if (i.getMaDoiTuong().equals(maDoiTuong)) {
                System.out.println("Ma doi tuong da ton tai trong danh sach!!!");
                return;
            }
        }
        System.out.print("Ho Va Ten: ");
        String tenDoiTuong = sc.nextLine();
        System.out.print("Gioi Tinh (Nam: False / Nu: True1): ");
        boolean gioiTinh = sc.nextBoolean();
        sc.nextLine();
        System.out.print("Nam Sinh: ");
        String namSinh = sc.nextLine();
        System.out.print("Mon Day: ");
        String monDay = sc.nextLine();
        System.out.print("Trinh Do: ");
        String trinhDo = sc.nextLine();

        listGiaoVien.add(new GiaoVien(monDay, trinhDo, maDoiTuong, tenDoiTuong, namSinh, gioiTinh));
        System.out.println("GIAO VIEN DA DUOC THEM VAO THANH CONG!!!");
    }

    public static void addSach(ArrayList<Sach> listSach, Scanner sc) {
        System.out.println("NHAP THONG TIN SACH");

        System.out.print("Ma Sach: ");
        String maTaiLieu = sc.nextLine();
        for (Sach i : listSach) {
            if (i.getMaTaiLieu().equals(maTaiLieu)) {
                System.out.println("ID da ton tai trong danh sach!!!");
                return;
            }
        }
        System.out.print("Ten Sach: ");
        String tenTaiLieu = sc.nextLine();
        int soTrang;
        while(true){
            System.out.print("So Trang: ");
            if(sc.hasNextInt()){
                soTrang = sc.nextInt();
                sc.nextLine();
                break;
            } else {
                System.out.println("Vui long nhap mot so nguyen!!!");
                sc.nextLine();
            }
        }

        listSach.add(new Sach(soTrang, maTaiLieu, tenTaiLieu, maTaiLieu));
        System.out.println("SACH DA DUOC THEM VAO THANH CONG!!!");
    }

    public static void addBao(ArrayList<Bao> listBao, Scanner sc) {
        System.out.println("NHAP THONG TIN BAO");

        System.out.print("Ma Bao: ");
        String maTaiLieu = sc.nextLine();
        for (Bao i : listBao) {
            if (i.getMaTaiLieu().equals(maTaiLieu)) {
                System.out.println("ID da ton tai trong danh sach!!!");
                return;
            }
        }    
        System.out.print("Ten Bao: ");
        String tenTaiLieu = sc.nextLine();
        int taiBan;
        while(true){
            System.out.print("Tai Ban: ");
            if(sc.hasNextInt()){
                taiBan = sc.nextInt();
                sc.nextLine();
                break;
            } else {
                System.out.println("Vui long nhap mot so nguyen!!!");
                sc.nextLine();
            }
        }

        listBao.add(new Bao(taiBan, maTaiLieu, tenTaiLieu, maTaiLieu));
        System.out.println("SACH DA DUOC THEM VAO THANH CONG!!!");
    }

    public static void printAllDoiTuong(ArrayList<HocSinh> listHocSinh, ArrayList<GiaoVien> listGiaoVien) {
        System.out.println("THONG TIN TOAN BO DOI TUONG");
        for (HocSinh i : listHocSinh) {
            System.out.println(i.toString());
        }
        for (GiaoVien j : listGiaoVien) {
            System.out.println(j.toString());
        }
    }

    public static void printSachOrBao(ArrayList<Sach> listSach, ArrayList<Bao> listBao, Scanner sc) {
        int choice = 0;
        do {
            System.out.println("Ban muon in thong tin cua: ");
            System.out.println("1. Sach.");
            System.out.println("2. Bao.");
            System.out.println("0. Thoat!!!");
            System.out.println("Nhap vao lua chon cua ban!!!");

            
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Danh sach sach trong thu vien: ");
                    for (Sach sach : listSach) {
                        System.out.println(sach);
                    }
                    break;
                case 2:
                    System.out.println("Danh sach bao trong thu vien: ");
                    for (Bao bao : listBao) {
                        System.out.println(bao);
                    }
                    break;
                case 0:
                    System.out.println("Thoat!!!");
                    break;
                default:
                    System.out.println("Lua chon cua ban khong hop le!!!");
                    break;
            }
        } while (choice != 0);

    }

}
