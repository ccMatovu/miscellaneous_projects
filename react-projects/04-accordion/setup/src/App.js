import React, { useState } from 'react';
import data from './data';
import SingleQuestion from './Question';
function App() {
  //const [questions,setQuestions] = useState([]);



  return (
    <>
      <div className='container'>
        <h2>question and answers</h2>
        <section className='info'>
          {data.map((question) => {
            const { id, title, info } = question
            return <SingleQuestion key={id} {...question} />
          })}
        </section>
      </div>
    </>
  )
}

export default App;
