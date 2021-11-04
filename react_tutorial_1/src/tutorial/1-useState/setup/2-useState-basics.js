import React, { useState } from 'react';

const UseStateBasics = () => {
  const [msg,setMsg] =useState("Random Title");

  const handlButton = () =>{
    if(msg === "Random Title" ){
      setMsg("Hello world");
    }else{
      setMsg("Random Title");
    }
  };
  return <>
  <h2>{msg}</h2>
  <button className='btn' type='button' onClick={handlButton}>change msg</button>
  </>;
};

export default UseStateBasics;
