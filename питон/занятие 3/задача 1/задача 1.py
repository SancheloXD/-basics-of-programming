# -- coding: utf-8 --
"""
Иванников Александр Владимирович ЗИТ-21
Задание 1. Даны два целых числа A и B (при этом A ≤ B). Выведите все числа от A до B включительно. 
"""
def perecislen(x,y):
    for i in range(x,y+1):
        print(i) 

a = int(input("Введите целое число А  "))
b = int(input("Введите целое число B  "))
if a<=b:
    perecislen(a,b)
else:
    print("Введeно не правильно")