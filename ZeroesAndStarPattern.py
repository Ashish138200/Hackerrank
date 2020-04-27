n=int(input())
for i in range(1,n+1):
    for j in range(1,2*n+2):
        if(i==j or j==n+1 or i+j==2*n+2):
            print("*", end="")
        else:
            print("0", end="")
    print("")