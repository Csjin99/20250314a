
// function sall(sall){
//     const selectall = document.querySelectorAll('input[type="checkbox"]');
//     selectall.forEach((checkall) => {
//         checkall.checked = sall.checked
//     });
// }

//전체체크
function sall(_sall){
    let checked = _sall.checked;
    const hobbylist = document.getElementsByName("hobby");
    for(let box of hobbylist){
        box.checked = checked;
    }
}

//모든 체크박스의 체크여부 검사
function isAllCkecked(selector){
    const checkBoxList = document.querySelectorAll(selector);
    for(let box of checkBoxList){
        if(!box.checked){
            return false;
        }
    }
    return true;
}

function addHobbyEvent(){
    const _sall = document.getElementById('allHobby');
    const hobbylist = document.getElementsByName("hobby");

    for(let box of hobbylist){
        //모든 체크박스의 체크여부를 확인해서 결과에 따라
        //all체크박스의 체크 여부를 변경한다.
        box.onclick = function(){
            let isChecked = isAllCkecked('input[name="hobby"]');
            _sall.checked = isChecked;
        }
    }
}

addHobbyEvent();


function test1(){
    const check = "input[name='hobby']:checked";
    const select = document.querySelectorAll(check);

    let res = "";
    select.forEach((el) => {
        res += el.value + ' ';
    });

    document.getElementById('box').innerHTML = res;

}