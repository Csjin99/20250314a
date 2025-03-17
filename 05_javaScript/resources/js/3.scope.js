/**
 * Scope
 * 변수나 함수가 접근 할 수 있는 유효범휘
 */

var number1 = 20;

function test1(){
    console.log(number1);
}

// test1();

function test2(){
    var number1 =40;
    console.log(number1);
}

// test2();

var number1 = 20;

function test3(){
    var number1 = 40;
    test4();
    console.log("number1t3 :" + number1);
}

function test4(){
    var number2 = 10;
    console.log("number1t4 :" + number1);
    console.log("number2t4 :" + number1);
}

test3();
console.log("number1 :" + number1);

/*
    렉시컬 스코프 : 함수가 선언된위치(코드작성위치) 기준으로 스코프가 결정(js사용)
    동적 스코프 : 함수가 실행된 위치 기준으로 스코프가 경정

*/


var i = 1000;
for(var i = 0; i<10; i++){ //vqr는 반복문내에서 scopr생성을 하지 않음
    console.log(i);
}
console.log("i = "+ i)

let j = 1000;
for(let j = 0; j<10; j++){ //let, const는 반복문내에 별도의 scope가 존재함
    console.log(j);
}
console.log("j = "+ j)

//------------------

let number3 = 100;


function funk1(){
    let number4 = 400;
    function funk2(){
        console.log(number3,number4);
    }
    funk2();
}
funk1();

