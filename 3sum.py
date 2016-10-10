import random 
import csv
import datetime, time

class SUM3:

	
	def Sum3(self, num,vali,valf):


		inicio = datetime.datetime.now()

		if len(num)<3: return []

	        num.sort()

	        res=[]

	        for i in range(len(num)-2):
	            esquerda=i+1
	            direita=len(num)-1
	            if i!=0 and num[i]==num[i-1]:continue
	            while esquerda<direita:
	                if num[esquerda]+num[direita]==-num[i]:
	                    res.append([num[i],num[esquerda],num[direita]])
        	            esquerda=esquerda+1
	                    direita=direita-1
	                    while num[esquerda]==num[direita-1] and esquerda<direita:esquerda=esquerda+1
	                    while num[direita]==num[direita+1] and esquerda<direita: direita=direita-1
	                elif num[esquerda]+num[direita]<-num[i]:
	                    esquerda=esquerda+1
	                else:
	                    direita=direita-1

		fim = datetime.datetime.now()

		print (inicio)
		print (fim)

		total = fim - inicio
		print(total)      

		arq2 = open('tempo.csv', 'ab')
		escrever = csv.writer(arq2, quoting=csv.QUOTE_ALL)
		escrever.writerow([len(num),vali,valf,len(res),total])

		
	



test=SUM3()

vali = -250
valf = 250
qt = 500
i =0
while i<6:
	numeros = [random.randint(vali,valf) for _ in range(qt)]
	test.Sum3(numeros,vali,valf)
	if valf == 4000:
		vali= vali*4
		valf= valf*4
	else:
		vali = vali*2
		valf = valf*2
	
	i=i+1

