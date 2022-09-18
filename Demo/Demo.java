package Demo;

public class Demo {
//    Inner Classes:

//    Trong Java, cũng có thể lồng các lớp (một lớp trong một lớp).
//    Mục đích của các lớp lồng nhau là để nhóm các lớp thuộc lại với nhau,
//    điều này làm cho mã của bạn dễ đọc và dễ bảo trì hơn.
//
//    Để truy cập lớp bên trong, hãy tạo một đối tượng của lớp bên ngoài,
//    rồi tạo một đối tượng của lớp bên trong:


    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
//        inner class:Sử dụng tham chiếu của một đối tượng của lớp bên ngoài để truy
//         xuất đến Innerclass:
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
//       statis nested class: sử dụng lớp bên ngoài để truy cập lớn bên trong:
//        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();

        System.out.println(myInner.y + myOuter.x);
    }

}

class OuterClass {
    int x = 10;
//    class StaticNestedClass{
//
//    }
    class InnerClass {
        int y = 5;
    }
}

//    Private Inner Class
//Không giống như một lớp "thông thường", một lớp bên trong có thể là privatehoặc protected.
// Nếu bạn không muốn các đối tượng bên ngoài truy cập vào lớp bên trong, hãy khai báo lớp là private:
//class OuterClass {
//    int x = 10;
//
//    private class InnerClass {
//        int y = 5;
//    }
//}
//    Nếu bạn cố gắng truy cập vào một lớp bên trong riêng tư từ một lớp bên ngoài, một lỗi sẽ xảy ra