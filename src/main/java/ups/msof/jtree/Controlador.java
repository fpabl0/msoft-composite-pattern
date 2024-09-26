/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.msof.jtree;

import vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import modelo.Archivo;
import modelo.ArchivoDOCX;
import modelo.ArchivoPDF;
import modelo.ArchivoXLSX;
import modelo.Carpeta;

/**
 *
 * @author vero s
 */
public class Controlador implements ActionListener{
    
    private Vista view;

    private Carpeta root;
    private String rutacom;
    
    public Controlador (Vista view,Carpeta carpeta)
    {
        this.view=view;
        this.rutacom="";
        this.root=new Carpeta(carpeta.getNombre());
       
        this.view.jButtonAgregar.addActionListener(this);
        this.view.jButtonEliminar.addActionListener(this);
        this.view.jButtoned.addActionListener(this);
    }

    public void iniciar(){
        view.setTitle("Gestion de Archivos");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed (ActionEvent e){
       rutacom=view.getRutaCompleta();
       var cleanRutaCompleta = rutacom.split(" - ");
       var ruta = cleanRutaCompleta[0].split("/");
       if(e.getSource().equals(view.jButtonAgregar) && view.hasSelection()) {
           var currentElement = searchTree(root, ruta[ruta.length - 1]);
           if (currentElement instanceof Carpeta subroot) {
               if (view.jRadioButtonDoc.isSelected()) {
                    System.out.println("DOCX");
                    var archivodocx=new ArchivoDOCX(view.jTextNombre.getText());
                    view.setArchivo(archivodocx.getNombre()+" - "+archivodocx.getTamanio()+" mb", false );
                    subroot.add(archivodocx);
               } else if(view.jRadioButtonPDF.isSelected()) {
                    System.out.println("PDF");
                    var archivopdf=new ArchivoPDF(view.jTextNombre.getText() );
                    view.setArchivo(archivopdf.getNombre()+" - "+archivopdf.getTamanio()+" mb", false);
                    subroot.add(archivopdf);
               } else if(view.jRadioButtonXlS.isSelected()) {
                    System.out.println("XLS");
                    var archivoxlsx=new ArchivoXLSX(view.jTextNombre.getText());
                    view.setArchivo(archivoxlsx.getNombre()+" - "+archivoxlsx.getTamanio()+" mb", false );
                    subroot.add(archivoxlsx);
               } else if(view.jRadioButtonSubc.isSelected()) {
                    System.out.println("Subcarpeta");
                    var carpeta=new Carpeta(view.jTextNombre.getText());
                    view.setArchivo(carpeta.getNombre(), true);
                    subroot.add(carpeta);
               }
           } else {
               System.out.println("Error: No es una carpeta");
           }
       }

       if(e.getSource().equals(view.jButtonEliminar) && ruta.length > 1 && view.hasSelection()) {
           System.out.println("PULSO ELIMINAR");
           var parentName = ruta[ruta.length - 2];
           var nameToDelete = ruta[ruta.length - 1];
           var parent = searchTree(root, parentName);
           if (parent instanceof Carpeta carpeta) {
               var fileToDelete = searchTree(carpeta, nameToDelete);
               carpeta.remove(fileToDelete);
           }
       }

       if(e.getSource().equals(view.jButtoned)) {
           System.out.println("PULSO CALCULAR");
           System.out.println(root.getTamanio());
           view.jLabel3.setText(root.getTamanio()+" mb");
       }
    }
    
    public void listar(){
        System.out.println("LISTADO GENERAL"+this.root.getElementos().size()
        +" -- "+this.root.getNombre()+ "--"+this.root.getTamanio());
        for(var elemento: this.root.getElementos()){
            System.out.println(elemento.getNombre());
            System.out.println(elemento.getTamanio());
        }
    }

    private Archivo searchTree(Archivo archivo, String matchingName) {
        if (Objects.equals(archivo.getNombre(), matchingName)) {
            return archivo;
        }
        if (archivo instanceof Carpeta carpeta) {
            var elementos = carpeta.getElementos();
            Archivo result = null;
            for (int i = 0; result == null && i < elementos.size(); i++ ) {
                result = searchTree(elementos.get(i), matchingName);
            }
            return result;
        }
        return null;
    }
}
