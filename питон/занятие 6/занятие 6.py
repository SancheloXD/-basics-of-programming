# -- coding: utf-8 --
"""
Иванников Александр Владимирович ЗИТ-21
Занятие 6. Создать графический интерфейс для занятия 5
"""

from tkinter import *
from tkinter import font
from tkinter import messagebox

window = Tk()
window.title("Задание 6. Создать графический интерфейс для занятия 5")
window.geometry('1000x200')

def z1():
    a = txt_1.get()
    n= int(a)
    i=1
    while i!=n+1:
        x=i**2
        messagebox.showinfo("Ответ на задание 1", 'Квадрат числа  '+str(i)+' равен:  '+str(x))
        i=i+1
        


tsk1 = Label(window, text='Задание 1. По данному целому числу N распечатайте все квадраты натуральных чисел, не превосходящие N, в порядке возрастания.', font=("Arial", 12,))
tsk1.place(x=10, y=20)
t1 = Label(window, text='Введите число N:')
t1.place(x=10, y=50)
txt_1 = Entry(window, width=9)
txt_1.place(x=110, y=50)
btn1 = Button(window, text='Решить', command=z1)
btn1.place(x=175, y=46)
otvet1 = Label(window, text='Ответ: ')
otvet1.place(x=230, y=50)
answer_1 = Label(window, text='', font=('Arial', 10, 'bold'))
answer_1.place(x=280, y=50)



def z2():
    a = txt_2.get()
    n = int(a)
    d = 2
    while d!=n+1:
        if n%d==0:
         break
        d+=1
    answer_2.configure(text = d)


tsk2 = Label(window, text='Задание 2. Дано целое число, не меньшее 2. Выведите его наименьший натуральный делитель, отличный от 1.', font=("Arial", 12, ))
tsk2.place(x=10, y=75)
t2 = Label(window, text='Введите число:')
t2.place(x=10, y=105)
txt_2 = Entry(window, width=9)
txt_2.place(x=110, y=105)
btn2 = Button(window, text='Решить', command=z2)
btn2.place(x=175, y=101)
otvet2 = Label(window, text='Ответ: ')
otvet2.place(x=230, y=105)
answer_2 = Label(window, text='', font=('Arial', 10, 'bold'))
answer_2.place(x=280, y=105)

def z3():
    a = txt_3.get()
    n = int(a)
    m = 1
    i=0
    while m<n:
        if m*2>n:
         break
        m*=2
        i+=1
    answer_3.configure(text = m)

tsk3 = Label(window, text='Задание 3. По данному натуральному числу N найдите наибольшую целую степень двойки, не превосходящую N.\nВыведите показатель степени и саму степень. Операцией возведения в степень пользоваться нельзя!', font=("Arial", 12, ))
tsk3.place(x=10, y=130)
t3 = Label(window, text='Введите N:')
t3.place(x=10, y=175)
txt_3 = Entry(window, width=9)
txt_3.place(x=110, y=175)
btn3 = Button(window, text='Решить', command=z3)
btn3.place(x=175, y=171)
otvet3 = Label(window, text='Ответ: ')
otvet3.place(x=230, y=175)
answer_3 = Label(window, text='', font=('Arial', 10, 'bold'))
answer_3.place(x=280, y=175)

window.mainloop()