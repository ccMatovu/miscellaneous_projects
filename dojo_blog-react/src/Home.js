import { useState } from "react";

const Home = ()=>{
    let [name,setName] = useState('charles');
    const handleClick = (e,name) =>{
        console.log('im clicked by '+name);
        setName('matox');
       
    }
    return (
        <div className='home'>
            <h2>Homepage</h2>
            <p>{name}</p>
            <button onClick={(e)=>{handleClick(e,'matovu')}}>Click me</button>
        </div>
    );
}

export default Home;