
let okClicked = document.getElementById("Ok-button");
let boxesAndLevers = document.getElementsByClassName("leverAndCheckbox");

okClicked.addEventListener("click", ev => {
    let password = document.getElementById("password-text").value;
    if(password == "TrustNo1"){
        let inputs = document.getElementsByTagName("input");
        for(let inputTag of inputs){
            inputTag.disabled = false;
        }
        document.getElementById("launch-button").disabled = true;
    }
});

function checkLevels(){
    let allBoxesAndLevers = true;
    for(let element of boxesAndLevers){
        if(element.type == "checkbox"){
            if(element.checked != true){
                allBoxesAndLevers = false;
            }
        }else {
            if(element.value != element.max){
                allBoxesAndLevers = false;
            }
        }
    }
    if(allBoxesAndLevers){
        document.getElementById("launch-button").disabled = false;
    }
}
