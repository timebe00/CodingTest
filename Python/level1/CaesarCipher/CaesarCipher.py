import string

#시저 암호
def solution(s, n):
    answer = ''
    lowercase = string.ascii_lowercase
    uppercase = string.ascii_uppercase
    lis = list(map(str, s))

    for i in lis:
        num = n
        if lowercase.find(i) > -1:
            num += lowercase.find(i)
            num %= 26
            answer += lowercase[num:num + 1]
        elif uppercase.find(i) > -1:
            num += uppercase.find(i)
            num %= 26
            answer += uppercase[num:num + 1]
        else:
            answer += ' '
    print(answer)
    return answer

