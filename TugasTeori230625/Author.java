/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasTeori230625;

/**
 *
 * @author Ari
 */
public class Author {
    private String name;
    private String email;
    
    public Author(String name, String email){
        this.name=name;
        this.email=email;
    }
    
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    @Override
    public String toString(){
        return "Author [name = "+ this.name + ",email = "+this.email +"]";
    }
}
