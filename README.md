# JAVA_basic
  

Constructor { 
    เป็น method พิเศษ ทำงานอัตโนมัติ ไม่ต้องเรียกใช้ ใช้กำหนดค่าเริ่มต้นให้ตัวแปลของ class
    - ชื่อเหมือนคลาส
    - ไม่คืนค่ากลับ ( no return )
    - เป็น public
}

Encapsulation { การซ่อนรายละเอียดข้อมูลการทำงานภายในคลาสไม่ให้ภายนอกเข้าถึงได้
    Access Modifier {
    - public เรียกใช้ได้ทั้งหมด
    - portected package เดียวกัน, ต่าง package แต่เป็นคลาสแม่ลูกกัน, คลาสเดียวกัน
    - private คลาสเดียวกัน 
    - package package เดียวกัน, คลาสเดียวกัน
    }
    Non-Access Modifier {
        ใช้กำหนดหน้า method หรือ attribute เพื่อให้เป็นแบบ static
        - static method ทำให้เรียกใช้งาน method ได้โดยไม่ต้องสร้าง Object
        - static attribute ทำให้เรียกใช้งาน attribute ได้โดยไม่ต้องสร้าง Object
    }
}

Inheritance {
    
}

test git stash
$ git stash
$ git pull origin master
$ git stash pop