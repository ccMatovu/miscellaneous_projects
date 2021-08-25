let popup = document.getElementById('powindow');
let popToggle = document.getElementById('openwin');
let popClose = document.getElementById('closewin');


popToggle.onclick = function (){
    popup.style.display="block";
};

popClose.onclick = function (){
    popup.style.display="none";
};