S = input()
l = list(S.split())
cr = len(l) #current_word
cn = 0 #count
sr = l[0]
for i in l:
    cn = len(i)
    if (cn < cr):
        sr = i
        cr = cn
print(sr)