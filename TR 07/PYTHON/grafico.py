#INICIO

#Bibliotecas
import matplotlib.pyplot as plt
import matplotlib.patches as mpatches
import csv
from collections import defaultdict


# Switch Case Inicio
def case_1():
	return "250.csv"
def case_2():
	return "500.csv"
def case_3():
	return "1000.csv"
def case_4():
	return "2000.csv"
def case_5():
	return "4000.csv"
def case_6():
	return "16000.csv"
def case_7():
	return "media.csv"
def case_default():
    print 'Valor invalido'

dict = {1 : case_1, 2 : case_2, 3 : case_3, 4 : case_4, 5 : case_5, 6 : case_6, 7 : case_7}
def switch(x):
	try:
		return dict[x]()
	except:
        	case_default()
#Switch Case Fim     


arq = switch(input('Selecione o grafico\n1->250\n2->500\n3->1000\n4->2000\n5->4000\n6->16000\n7->Media\n'))


#Leitura do arquivo CSV Inicio
val = defaultdict(list) 
with open(arq) as f:
    reader = csv.DictReader(f)
    for row in reader:
        for (k,v) in row.items():
            val[k].append(v) 
#Leitura do Arquivo CSV Fim


#Gerar Grafico Media Inicio                                 
if(arq =='media.csv'):
	linha1 = mpatches.Patch(color='pink', label='16000')
	linha2 = mpatches.Patch(color='black', label='4000')
	linha3 = mpatches.Patch(color='blue', label='2000')
	linha4 = mpatches.Patch(color='green', label='1000')
	linha5 = mpatches.Patch(color='yellow', label='500')
	linha6 = mpatches.Patch(color='red', label='250')

	qunt = val['Quantidade']
	temp = val['Media']

	plt.plot([0, qunt[5]],[0,temp[5]],'pink')

	plt.plot([0, qunt[4]],[0,temp[4]],'black')

	plt.plot([0, qunt[3]],[0,temp[3]],'blue')

	plt.plot([0,qunt[2]],[0,temp[2]],'green')

	plt.plot([0,qunt[1]],[0,temp[1]],'yellow')

	plt.plot([0,qunt[0]],[0,temp[0]],'red')


#Gerar Grafico Media Fim

#Gerar Grafico Inicio                                 
else:
	linha1 = mpatches.Patch(color='pink', label='[-16000:16000]')
	linha2 = mpatches.Patch(color='black', label='[-4000:4000]')
	linha3 = mpatches.Patch(color='blue', label='[-2000:2000]')
	linha4 = mpatches.Patch(color='green', label='[-1000:1000]')
	linha5 = mpatches.Patch(color='yellow', label='[-500:500]')
	linha6 = mpatches.Patch(color='red', label='[-250:250]')

	posi= val['Possibilidades']
	temp= val['Tempo Total']
	qunt = val['Quantidade']

	plt.plot([0, qunt[5]],[0,temp[5]],'pink')
	plt.text(qunt[5],temp[5], posi[5])

	plt.plot([0, qunt[4]],[0,temp[4]],'black')
	plt.text(qunt[4],temp[4], posi[4])
	
	plt.plot([0, qunt[3]],[0,temp[3]],'blue')
	plt.text(qunt[3],temp[3], posi[3])

	plt.plot([0,qunt[2]],[0,temp[2]],'green')
	plt.text(qunt[2],temp[2], posi[2])
	
	plt.plot([0,qunt[1]],[0,temp[1]],'yellow')
	plt.text(qunt[1],temp[1], posi[1])
	
	plt.plot([0,qunt[0]],[0,temp[0]],'red')
	plt.text(qunt[0],temp[0], posi[0])
	


plt.legend(handles=[linha1,linha2,linha3,linha4,linha5,linha6],loc= 2)
plt.xlabel('Quantidade de Elementos')
plt.ylabel('Tempo Em Segundos')
plt.title(' 3- SUM Grafico ')
plt.grid(True)

#Gerar Grafico Fim

#Exibir o Grafico na Tela
plt.show()

#FIM
