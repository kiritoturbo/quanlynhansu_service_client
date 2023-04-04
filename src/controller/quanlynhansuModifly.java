/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author MANH TRUONG
 */
public class quanlynhansuModifly {

    public static String addChucvu(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.addChucvu(arg0, arg1, arg2);
    }

    public static String addChuyenmon(java.lang.String arg0, java.lang.String arg1) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.addChuyenmon(arg0, arg1);
    }

   
    public static String addNhanvien(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, javax.xml.datatype.XMLGregorianCalendar arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.addNhanvien(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    }

    public static String addPhongban(java.lang.String arg0, java.lang.String arg1, int arg2) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.addPhongban(arg0, arg1, arg2);
    }

    public static String addTrinhdohocvan(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.addTrinhdohocvan(arg0, arg1, arg2);
    }

    public static String deleteChucvu(java.lang.String arg0) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.deleteChucvu(arg0);
    }

    public static String deleteChuyenmon(java.lang.String arg0) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.deleteChuyenmon(arg0);
    }

    public static String deleteLuong(java.lang.String arg0) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.deleteLuong(arg0);
    }

    public static String deleteNhanvien(java.lang.String arg0) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.deleteNhanvien(arg0);
    }

    public static String deletePhongban(java.lang.String arg0) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.deletePhongban(arg0);
    }

    public static String deleteTrinhdohocvan(java.lang.String arg0) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.deleteTrinhdohocvan(arg0);
    }

    public static java.util.List<controller.Chucvu> findAllChucvu() {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.findAllChucvu();
    }

    public static java.util.List<controller.Chuyenmon> findAllChuyenmon() {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.findAllChuyenmon();
    }

    public static java.util.List<controller.Tinhluong> findAllLuong() {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.findAllLuong();
    }

    public static java.util.List<controller.Nhanvien> findAllNhanvien() {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.findAllNhanvien();
    }

    public static java.util.List<controller.Phongban> findAllPhongban() {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.findAllPhongban();
    }

   
    public static java.util.List<controller.Trinhdohocvan> findAllTrinhdohocvan() {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.findAllTrinhdohocvan();
    }
     public static Trinhdohocvan findTrinhdohocvan(java.lang.String arg0) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.findTrinhdohocvan(arg0);
    }

    public static Chucvu findChucvu(java.lang.String arg0) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.findChucvu(arg0);
    }

    public static Chuyenmon findChuyenmon(java.lang.String arg0) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.findChuyenmon(arg0);
    }

    public static Tinhluong findLuong(java.lang.String arg0) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.findLuong(arg0);
    }

    public static Nhanvien findNhanvien(java.lang.String arg0) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.findNhanvien(arg0);
    }

    public static Phongban findPhongban(java.lang.String arg0) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.findPhongban(arg0);
    }

    public static Trinhdohocvan findTrinhdohocvan_1(java.lang.String arg0) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.findTrinhdohocvan(arg0);
    }

    public static Dangnhap login(java.lang.String arg0, java.lang.String arg1) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.login(arg0, arg1);
    }

    public static java.util.List<controller.Dangnhap> loginfindAll() {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.loginfindAll();
    }

    public static String updateChucvu(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.updateChucvu(arg0, arg1, arg2);
    }

    public static String updateChuyenmon(java.lang.String arg0, java.lang.String arg1) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.updateChuyenmon(arg0, arg1);
    }

    
    public static String updateNhanvien(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, javax.xml.datatype.XMLGregorianCalendar arg6, java.lang.String arg7, java.lang.String arg8, java.lang.String arg9, java.lang.String arg10) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.updateNhanvien(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    }

    public static String updatePhongban(java.lang.String arg0, java.lang.String arg1, int arg2) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.updatePhongban(arg0, arg1, arg2);
    }

    public static String updateTrinhdohocvan(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.updateTrinhdohocvan(arg0, arg1, arg2);
    }

    public static String addLuong(java.lang.String arg0, java.lang.String arg1, int arg2, double arg3, double arg4) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.addLuong(arg0, arg1, arg2, arg3, arg4);
    }

    public static String updateLuong(java.lang.String arg0, java.lang.String arg1, int arg2, double arg3, double arg4) {
        controller.QuanlynhansuVersion3Service_Service service = new controller.QuanlynhansuVersion3Service_Service();
        controller.QuanlynhansuVersion3Service port = service.getQuanlynhansuVersion3ServicePort();
        return port.updateLuong(arg0, arg1, arg2, arg3, arg4);
    }

   
    
    
}
