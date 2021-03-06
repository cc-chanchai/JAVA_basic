# JAVA_basic

คุณสมบัติการเขียนโปรแกรมเชิงวัตถุ (OOP) ==> Encapsulation, Inheritance, Polymorphism 

Constructor
    เป็น method พิเศษ ทำงานอัตโนมัติ ไม่ต้องเรียกใช้ ใช้กำหนดค่าเริ่มต้นให้ตัวแปลของ class
    - ชื่อเหมือนคลาส
    - ไม่คืนค่ากลับ (no return)
    - เป็น public


Encapsulation การซ่อนรายละเอียดข้อมูลการทำงานภายในคลาสไม่ให้ภายนอกเข้าถึงได้
    Access Modifier 
    - public เรียกใช้ได้ทั้งหมด
    - portected package เดียวกัน, ต่าง package แต่เป็นคลาสแม่ลูกกัน, คลาสเดียวกัน
    - private คลาสเดียวกัน 
    - package package เดียวกัน, คลาสเดียวกัน
    Non-Access Modifier 
    ใช้กำหนดหน้า method หรือ attribute เพื่อให้เป็นแบบ static
    - static method ทำให้เรียกใช้งาน method ได้โดยไม่ต้องสร้าง Object
    - static attribute ทำให้เรียกใช้งาน attribute ได้โดยไม่ต้องสร้าง Object
    

Inheritance การสืบทอดคุณสมบัติจากคลาสแม่(superclass) ไปให้คลาสลูก(subclass) สามารถใช้ attribute , method ของคลาสแม่ได้
    - overiding method เมธอดของคลาสลูกมีชื่อเหมือนกับเมธอดของคลาสแม่
    - Super ใช้อ้างอิงถึง constructor ของคลาสแม่


final 
    กำหนด final ให้คลาส ทำให้คลาสไม่สารมารถมีคลาสลูกได้
    กำหนด final ให้เมธอด ทำให้เมธอดไม่สารมารถ oveide method ได้
    กำหนด final ให้ attribute ทำให้ attribute นั้นเป็นค่าคงที่(constant)


Polymorpism (การพ้องรูป) 
    คุณสมบัติที่สามารถตอบสนองต่อ method เดียวกันด้วยรูปแบบการทำงานที่แตกต่างกันและสามารถกำหนด Object ได้หลายรูปแบบ
    - method overloading เมธอดหลายตัวที่อยู่ในคลาสเดียวกัน ชื่อเหมือนกัน มีหน้าที่เหมือนกันแต่ต่างกันในส่วนของรายการพารามิเตอร์
    - method overriding เป็นการกำหนดหารทำงานให้กับเมธอดที่สืบทอดมาจากการถ่ายทอดคุณสมบัติ(Inheritance)

Abstract class 
    - คลาสที่มี abstract method จะต้องประกาศคลาวนั้นเป็น abstract ด้วย
    - คลาสลูกที่สืบทอดมาจาก abstract class จะต้องประกาศ abstract method ทุกตัวที่มีในคลาสแม่(ไม่ต้องมีโค้ดภายในก็ได้ แต่ต้องประกาศ)
Abstract method 
    คือ เมธอดว่างเปล่าของคลาสแม่ที่ยังไม่ได้มีการกำหนดการทำงานลงไป และจะถูกกำหนดการทำงานภายหลัง จากคลาสลูกที่ได้รับการสืบทอด abstract method


Interface 
    - หลักการคล้ายกับ abstract class แต่มีข้อแตกต่างคือไม่สามารถสร้างเมธอดที่มีการภายใน interface ได้ (เป็น abstract ทั้งหมด) และไม่จำเป็นต้องมีความสัมพันธ์กับ interface
    - คลาสที่เรียกใช้ interface จะต้องทำการ implements จะต้องประกาศ method ทุกตัวที่มีใน Interface (ไม่ต้องมีโค้ดภายในก็ได้ แต่ต้องประกาศ)


test git stash
$ git stash
$ git pull origin master
$ git stash pop