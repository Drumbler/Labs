package LR7.Example2;

/*
суперкласс с приватным текстовым полем.
В базовом классе должен быть метод для присваивания значения полю:
без параметров и с одним текстовым параметром.
Объект суперкласса создается передачей одного текстового аргумента конструктору.
Доступное только для чтения свойство результатом возвращает длину текстовой строки.
 */
public class SuperClass{
    //приватным текстовым полем.
    private String str1;

    SuperClass() {setStr1();}
    //Объект суперкласса создается передачей одного текстового аргумента конструктору.
    SuperClass (String str1){setStr1(str1);}
    //метод для присваивания значения полю без параметров
    public void setStr1 (){
        this.str1 = "здесь ничего нет";
    }
    //метод для присваивания значения полю с одним текстовым параметром
    public void setStr1 (String str1){
        this.str1 = str1;
    }

    public String getStr1(){
        //   System.out.println(str1);
        return str1;
    }
    //Доступное только для чтения свойство результатом возвращает длину текстовой строки.
    public int getStr1length(){
        //   System.out.println("Длина текстовой строки="+str1.length());
        return str1.length();
    }


    @Override
    public String toString() {
        String superClassNameAndFieldValue = "superClassTest{" + "str1=\"" + getStr1() + '\"' + " string.length = " +"\""+getStr1length()+"\"}";
        return superClassNameAndFieldValue;
    }
}
