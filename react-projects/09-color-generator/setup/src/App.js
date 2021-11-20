import React, { useState } from 'react'
import SingleColor from './SingleColor'

import Values from 'values.js'

function App() {
  const [color,setColor] = useState('ere');
  const [error,setError] = useState(false);
  const [list,setList] = useState([]);
console.log('sdf');
  const handleSubmit = (e)=>{
    e.prevenDefault();
    let colors = new Values(color).all(10);
    console.log('the colores are the following'+colors);

  };
  return <>
  <section className="container">
    <h3>color gene</h3>
    <form onSubmit={handleSubmit}>
      <input type="text" value={color} onChange={(e)=>{
        setColor(e.target.value)
      }}
      placeholder="#f15025"/>
      <button className="btn" type="submit">submit</button>
    </form>
  </section>
  <section className='colors'>
    <h4>list here</h4>
  </section>
  </>
}

export default App
