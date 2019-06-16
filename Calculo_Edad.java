import java.io.*;
import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Calculo_Edad {
    public static void main(String[] args) {
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        Calendar calendario = GregorianCalendar.getInstance();
        Scanner lectura = new Scanner(System.in);
        
        int añoAc, mesAc, diaAc;
        int añoNa = 0, mesNa = 0, diaNa = 0;
        int añoE, mesE, diaE;
        
        añoAc = calendario.get(Calendar.YEAR);
        mesAc = calendario.get(Calendar.MONTH) + 1;
        diaAc = calendario.get(Calendar.DATE);
        
        archivo = new File("Edad.txt");
        
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
                System.out.print("Ingrese año de nacimiento: ");
                añoNa = lectura.nextInt();
                System.out.print("Ingrese mes de nacimiento: ");
                mesNa = lectura.nextInt();
                System.out.print("Ingrese dia de nacimiento: ");
                diaNa = lectura.nextInt();
        if(añoNa <= añoAc){
            if (diaAc < diaNa){
                diaAc = diaAc +30;
                mesAc = mesAc -1;   
            }
            if (mesAc < mesNa){
                mesAc = mesAc +12;
                añoAc = añoAc -1;   
            }
            añoE = añoAc - añoNa;
            mesE = mesAc - mesNa;
            diaE = diaAc - diaNa;
            escribir = new FileWriter(archivo,true);
            linea = new PrintWriter(escribir);
            linea.printf("Su edad es: %d años, %d meses y %d dias\r\n", añoE,mesE,diaE);
            linea.close();
            escribir.close();
        }
            } catch (IOException ex) {
                Logger.getLogger(Calculo_Edad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
               try {
                System.out.print("Ingrese año de nacimiento: ");
                añoNa = lectura.nextInt();
                System.out.print("Ingrese mes de nacimiento: ");
                mesNa = lectura.nextInt();
                System.out.print("Ingrese dia de nacimiento: ");
                diaNa = lectura.nextInt();
        if(añoNa <= añoAc){
            if (diaAc < diaNa){
                diaAc = diaAc +30;
                mesAc = mesAc -1;   
            }
            if (mesAc < mesNa){
                mesAc = mesAc +12;
                añoAc = añoAc -1;   
            }
            añoE = añoAc - añoNa;
            mesE = mesAc - mesNa;
            diaE = diaAc - diaNa;
            escribir = new FileWriter(archivo,true);
            linea = new PrintWriter(escribir);
            linea.printf("Su edad es: %d años, %d meses y %d dias\r\n", añoE,mesE,diaE);
            linea.close();
            escribir.close();
        }
            } catch (IOException ex) {
                Logger.getLogger(Calculo_Edad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
        
    }
    }
    
