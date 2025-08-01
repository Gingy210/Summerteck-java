def stalinsort(listofnums):
    pointer=0
    while pointer!=len(listofnums)-1:
        if listofnums[pointer]<listofnums[pointer+1]:
            pointer+=1
        else:
            listofnums.pop(pointer+1)    
x=[]
y=True
while y==True:
    inpout=input("put in number type done when done\n")
    if inpout=="done":
        y=False
    else:
        x.append(int(inpout))
stalinsort(x)
print(x)
        