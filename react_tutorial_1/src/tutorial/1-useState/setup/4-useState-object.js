import React, { useState } from 'react'

const UseStateObject = () => {
  const [person, setMessage] = useState({
    name: 'Pete',
    age: 20,
    message: 'howdy',
  })

  const handleClick = () => {
    setMessage({ ...person, message: 'its cha' })
  }

  return (
    <>
      <div>
        <h2>{person.name}</h2>
        <h2>{person.age}</h2>
        <h2>{person.message}</h2>
        <button type='button' className='btn' onClick={handleClick}>
          change message
        </button>
      </div>
    </>
  )
}

export default UseStateObject
