/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasTeori230625;

/**
 *
 * @author Ari
 */
public class Main {
    public static void main(String []args){
        Author author = new Author("FACHRI PUTRA ANATA", "fachrianata123@gmail.com");
        
        System.out.println("DETAIL DARI AUTHOR : " +author);
        
        System.out.println("----------------------------------------------------------------------------------------");
        
        Book book = new Book("2025-06-23-15-00", "Money Is The Key", author, 100000, 50);
        
        System.out.println("Detail Buku Yang Ditulis: ");
        System.out.println(book);
        System.out.println("----------------------------------------------------------------------------------------");
        
        System.out.println("Mengakses data terpisah :");
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Judul Buku: " + book.getName());
        System.out.println("Harga: Rp" + book.getPrice());
        System.out.println("Stok: " + book.getQty());
        
        // Mengakses data penulis DARI objek buku
        System.out.println("Nama Penulis : " + book.getAuthorName());
        System.out.println("Email Penulis : " + book.getAuthor().getEmail());
    }
}
