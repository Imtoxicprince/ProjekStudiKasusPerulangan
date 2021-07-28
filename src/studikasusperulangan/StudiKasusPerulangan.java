/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasusperulangan;

/**
 *
 * @author hp
 */
public class StudiKasusPerulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama = "Aisyah Anaya Umami";
        System.out.println("Nama Anak : "+nama);
        
        char[] x = {'a','i','s','y','a','h','a','n','a','y','a','u','m','a','m','i'};
        int j = 0;
        for(int i = 0; i < x.length; i++){
            if(x[i]=='a'){
                j+=1;
            }
        }
                System.out.println("Huruf \"a\" sebanyak : "+j);
                
        
                System.out.println("");
                String nama2 = "Salsabila Rahmawati Ningsih";
                System.out.println("Nama Anak ke-2 : "+nama2);
                
                
                char[] y = {'s','a','l','s','a','b','i','l','a','r','a','h','m','a','t','i','n','i','n','g','s','i','h'};
                int b = 0;
                for(int a = 0; a<y.length;a++){
                    if(y[a]=='i'){
                        b+=1;
                    }
                }
                System.out.println("Huruf \"i\" sebanyak : "+b);
            }
                
        }
    
    

