
    public class MyList <T>{
        public int capasity=10;
        T[] array= (T[]) new Object[10];
        int size=0;

        public MyList() {
            T[] array=(T[]) new Object[10];
        }

        public MyList(int capasity) {
            this.capasity = capasity;
            T[] array= (T[]) new Object[capasity];
        }

        public int size() {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null)
                    return size;
            }return size;
        }
        public int getCapasity(){
            return this.capasity;
        }

        public void add(T data){
            if(this.size()==this.getCapasity()){
                reInitializeArray();
                this.array[size]=data;
                size++;
            }else{
                this.array[size]=data;
                size++;
            }
        }

        public void reInitializeArray(){
            int newCapacity=this.capasity*2;
            this.capasity=newCapacity;
            T[] newArray= (T[]) new Object[newCapacity];
            System.arraycopy(this.array,0,newArray,0,array.length);
            array=newArray;
        }

        public T get(int index){
            if(index<0 || index>size){
                return null;
            }
            return array[index];
        }
        public void remove(int index){
            if(index<0 || index>size){
                return;
            }
            for(int i=index; i<size-1; i++){
                array[i]=array[i+1];
            }
            this.array[size-1]=null;
            size--;
        }

        public void set(int index,T data){
            if(index<0 || index>size){
                return;
            }
            array[index]=data;
        }

        public String toString() {
            String str = "[";
            for (int i = 0; i < size; i++) {
                str = str + array[i];
                if(i!=size-1){
                    str+=", ";
                }
            }
            str=str+ "]";
            return str;
        }
        public int indexOf(T data){
            int index=-1;
            for(int i=0; i<size; i++){
                if(this.array[i].equals(data)){
                    index=i;
                }
            }
            return index;
        }
        public int lastIndexOf(T data){
            int index=-1;
            for(int i=0; i<size; i++){

            }
            return -1; // ************************
        }

        public boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
    }


