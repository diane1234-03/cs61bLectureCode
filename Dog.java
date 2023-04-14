public class Dog {
    public int weightInPounds;
    public Dog (int w){
        weightInPounds = w;
    }
    public void bark() {
        if (weightInPounds <10){
            System.out.println("yip!");
        }else if(weightInPounds <30){
            System.out.println("bark");
        }else{
            System.out.println("woof");
        }
    }  
    
    public static Dog bigger(Dog d1,Dog d2){
        if (d1.weightInPounds>d2.weightInPounds){
            return d1;
        }
        return d2;
    }
    // 非静态的比较方法
    public Dog bigger2(Dog d){
        if (this.weightInPounds >d.weightInPounds){
            return this ;
        }
        return d;
    }
}
