s=input()
l=list(s)
z=len(l)
l.append(" ")
sr=""
c=1
i=0
while(i<z):
    c=1
    for j in range(i,z):
            if(l[i]==l[j+1]):
                i=i+1
                c=c+1
            else:
                break
    if(c==1):
        sr=sr+l[i]
    else:
        sr=sr+l[i]+str(c)
    i=i+1
print(sr)