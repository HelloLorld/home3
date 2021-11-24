# home3
NC homework

## Создание своего списка, а также тест производительности

____

### Сравнение ArrayList, LinkedList, MyLinkedList
![image](https://user-images.githubusercontent.com/62810505/143263587-d19cc431-1260-4c14-9e69-98fd86c278bc.png)
![image](https://user-images.githubusercontent.com/62810505/143263686-7d606975-9649-446c-a1ff-aadc67fd8811.png)
![image](https://user-images.githubusercontent.com/62810505/143263741-e5c35b26-7c1d-4b07-a695-b047ef923ef6.png)

#### **Итоги сравнения**:
Из диаграмм нам видно:
- если в ходе работы нашей программы нам потребуется получать и изменять значение элементов, то нам нужно использовать ArrayList
- если в ходе работы нашей программы нам потребуется добавлять элементы (в конец, середину и т.д), то нам нужно использовать LinkedList
- если в ходу работы нашей программы нам часто потребуется удалять элементы, то лучше будет использовать ArrayList
____
### Сравнение HashSet, LinkedHashSet, TreeSet
![image](https://user-images.githubusercontent.com/62810505/143262605-f5699bee-a757-4f94-b251-80c89dae927c.png)
#### **Итоги сравнения**:
Из диаграмм нам видно:
- если в ходе работы нашей программы нам потребуется добавлять множество элементов, то лучше использовать HashSet
- если в ходе работы нашей программы нам потребуется удалять элементы, то лучше использовать LinkedHashSet
____
### Сравнение HashMap, LinkedHashMap, TreeMap
![image](https://user-images.githubusercontent.com/62810505/143263406-d6fb286a-371e-42e0-b994-08c9f949cd61.png)
![image](https://user-images.githubusercontent.com/62810505/143263487-71587ffb-a988-40df-9bab-3a9973685a3d.png)
#### **Итоги сравнения**:
Из диаграмм нам видно:
- если в ходе работы нашей программы нам потребуется добавлять множество элементов, то лучше использовать HashMap
- если в ходе работы нашей программы нам потребуется удалять и получать элементы, то лучше использовать LinkedHashMap
