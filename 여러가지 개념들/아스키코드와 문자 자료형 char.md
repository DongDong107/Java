# Char
<https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=zlatmgpdjtiq&logNo=221414951654>

## 아스키코드
문자를 정해진 코드 값으로 변환하는 것을 "문자 인코딩"
코드값을 다시 문자로 변환하는 것을 "문자 디코딩"

가장 기본이 되는 인코딩은 아스키코드.

영문자는 대문자, 소문자, 특수문자, 기호를 포함해도 1바이트로 표현 가능하기 때문에   
아스키코드는 1바이트만 사용하지만 다른 언어문자는 불가능.

## 유니코드
모든 문자를 표현하려면 2바이트 이상 사용하게 되는데, 이때 각 언어의 표준 인코딩을 정의해 놓은 것.
유니코드의 1바이트는 아스키코드 값과 호환가능, 그 밖의 문자를 2바이트나 그 이상의 조합으로 표현

## char 형
자바에서는 유니코드에 기반하여 문자를 표현하기 때문에, 자바의 문자 자료형인 char형은 2바이트 사용.

다음과 같이 선언 가능
```java
char str = 'A'; // "A" 불가능 <- String 형
```

해당 알파벳을 아스키코드로 표현하려면
```java
(int)str
```
으로 표현 가능.

역으로 아스키코드 숫자를 문자로 표현하려면
```java
(char)65; // A
```

## 자바에서 따옴표 차이
큰따옴표(" ")는 문자열(String)을 감싸는 기호 -\> 문자 여러개 입력   
작은따옴표(' ')는 문자(Character)를 감싸는 기호 -\> 문자 하나만 입력





