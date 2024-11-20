public class DynamicArray {

    int capacity;
    int size;
    String[] data;

   DynamicArray(){

       capacity = 2;
       size = 0 ;
       data = new String[capacity];
   }

   public void Resize(){

       capacity += 1;
       String [] data2 = new String[capacity];
       for(int i = 0; i<=data.length;i++){

           data2[i] = data[i];
       }
       data = data2;
   }


   public void Add_Element(String name){

       if(size == capacity){
           Resize();
       }
        else {

            data[size] = name;
            size++;
       }

   }


   public void remove_element(String name){

       for(int i = 0; i<=size ; i++ ){

           if(data[i].equals(name)){

               for(int j = 0 ; j<size-1;j++){

                   data[j] = data[j+1];

               }
               size--;
               break;
           }
       }
   }

    public void Get_Ele(int position){


        if(position<0|| position>=size){

            System.out.println("Index out of bound");

        }

        else{

            System.out.println(data[position]);
        }

    }


}
