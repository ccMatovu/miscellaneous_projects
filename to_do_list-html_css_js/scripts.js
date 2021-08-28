let taskList = [];
const AddTaskButtonPress = document.querySelector("#add-task-button");

function loadTasksFromLocalStorage(){
    taskList = JSON.parse(localStorage.getItem("tasks")) || [];
    taskList.forEach((task) =>{
        let liTag = createLiTag();
        addTextToSpan(task,liTag);
        document.querySelector('#task-list').appendChild(liTag);
    });
}
loadTasksFromLocalStorage();

AddTaskButtonPress.addEventListener('click',(e) =>{
    const taskInput = document.querySelector("#input-task");
    if(taskInput.value != ""){
        let liTag = createLiTag();
        addTextToSpan(taskInput.value,liTag);
        document.querySelector('#task-list').appendChild(liTag);
        taskList.push(taskInput.value); //add task to list
        updateLocalStorage();
    }
});

function createLiTag(){
    let liTag = document.createElement('li');

    //add checkbox  with its class to li tag;
    const taskCheckBox = document.createElement('input');
    taskCheckBox.setAttribute("type","checkbox");
    taskCheckBox.setAttribute("class","box");
    taskCheckBox.onclick=function (){
        if(this.checked){
            this.nextElementSibling.style.textDecoration = "line-through";
        }else{
            this.nextElementSibling.style.textDecoration = "none";
        }
    }
    liTag.appendChild(taskCheckBox);

    //add span with class to li tag
    const spanTag = document.createElement('span');
    spanTag.className += "task";
    liTag.appendChild(spanTag);

    //add delete button
    const deleteButton = document.createElement('button');
    deleteButton.className += "delete-btn";
    deleteButton.addEventListener('click',removeTask);
    liTag.appendChild(deleteButton);
    return liTag;
}

function addTextToSpan(text,liTag){
        liTag.childNodes[1].innerHTML = text;
}

function updateLocalStorage(){
    localStorage.setItem("tasks",JSON.stringify(taskList));
}

function removeTask(){
    let todoTask =this.parentElement.childNodes[1].textContent;
    taskList.splice(taskList.indexOf(todoTask),1); //remove task from list
    updateLocalStorage();
    this.parentElement.remove();
}