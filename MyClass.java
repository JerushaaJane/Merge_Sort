public class MyClass {
    void merge(int[]a,int beg,int mid,int end){
        int l=mid-beg+1;
        int r=end-mid;
        int[] larray=new int[l];
        int[] rarray=new int[r];
        
        for(int i=0;i<l;++i){
        larray[i]=a[beg+i];
        }
        for(int j=0;j<r;++j){
        rarray[j]=a[mid+1+j];
        }
        
        int i=0,j=0,k=beg;
        while(i<l && j<r){
            if(larray[i]<=rarray[j]){
                a[k]=larray[i];i++;
            }
            else{
                a[k]=rarray[j];j++;
            }
            k++;    
        }
        
        while(i<l){
            a[k]=larray[i];
            i++;
            k++;
        }
        while(j<r){
            a[k]=rarray[j];
            j++;
            k++;
        }
    }
    
    void sort(int[]a,int beg,int end){
        //int mid
        if(beg<end){
            int mid=(beg+end)/2;
            sort(a,beg,mid);
            sort(a,mid+1,end);
            merge(a,beg,mid,end);
            
        }
    }
    
    public static void main(String args[]) {
      int []a={2,3,5,6,7,8,34,56};    
      int beg=0;
      int end=a.length-1;
      MyClass obj=new MyClass();
      obj.sort(a,beg,end);
      for(int i=0;i<a.length;i++){
          System.out.println(a[i]);
      }
      
    }
}
