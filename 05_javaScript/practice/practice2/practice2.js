function res(){
    const num1 = Number(document.getElementById("numb1").value);
    const num2 = Number(document.getElementById("numb2").value);
    const opr = document.getElementById("opration").value;

    const result = document.querySelector('#result');

    if((opr == '/' || opr === '%') && num2 === 0){
        result.value = "연산불가";
        result.classList.add("non-cal");
    } else{
        result.value = calculator(num1, num2, opr);
        result.classList.remove("non-cal");
    }

    
    
}

// +, -, *, /, % 연산을 진행함
function calculator(num1, num2, opr){
    let result;
    switch(opr){
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            result = num1 / num2;
            break;
        case '%':
            result = num1 & num2;
            break;
    }
    return result;

}