//WAP to print sum of even numbers using local inner class?
package Day15;
class Local{
    int sum = 0;
    void show(){
        class Local_nested{
            void disp(){
                for(int i = 0;i<=10;++i){
                    if(i%2==0){
                        sum+=i;
                    }
                }
                System.out.println("Sum of even numbers:"+sum);
            }
        }
        Local_nested l = new Local_nested();
        l.disp();
    }
}