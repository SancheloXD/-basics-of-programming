# -- coding: utf-8 --
"""
В переменной age хранится возраст. Вывести на экран "Поздравляем вы поступили в ВГУИТ", если age больше или равно "16", или если age меньше 16 - "Сначала нужно окончить школу!".
Проверить, что значение age больше 0 и меньше 75.
Проверить, что поступающего зовут не Иван.
Если Абитуериенту меньше 16 вывести на экран сколько лет ему еще учиться в школе.

Иванников Александ Владимирович, ЗИТ-21

"""
age = int(input("Введите ваш возраст"))
if age>0 and age<75:
 if age>=16:
  name=str(input("Введите своё имя"))
  if name == 'Иван': print("Недоступное имя")
  else: print('Поздравляем вы поступили в ВГУИТ')
 else: print('Сначала нужно окончть школу! Вам нужно еще '+str(16-age)+' учиться в школе')
else: print('Недопустимый возраст')