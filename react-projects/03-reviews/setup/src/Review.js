import React, { useState } from 'react'
import people from './data'
import { FaChevronLeft, FaChevronRight, FaQuoteRight } from 'react-icons/fa'

const Review = () => {
  const [index, setIndex] = useState(1)
  const { name, job, image, text } = people[index];

  const checkIndex = (index)=>{
    if(index > people.length-1){
      return 0;
    }else if(index < 0){
      return people.length-1;
    }else{
      return index;
    }
  };

  const nextPerson = ()=>{
    setIndex((index)=>{
          const newIndex = index + 1;
          return checkIndex(newIndex);
    });
  };

  const prevPerson = () => {
    setIndex((index) => {
      const newIndex = index - 1;
      return checkIndex(newIndex);
    })
  }

  const randPerson =()=>{
    let ranNumber = Math.floor(Math.random() * people.length);
    if(ranNumber === index){
      ranNumber = index+1;
    }
    setIndex(checkIndex(ranNumber));
  };

  return (
    <article className='review'>
      <div className='img-container'>
        <img src={image} alt={name} className='person-img'></img>
        <span className='quote-icon'>
          {' '}
          <FaQuoteRight />
        </span>
      </div>
      <h4 className='author'>{name}</h4>
      <p className='job'>{job}</p>
      <p className='info'>{text}</p>
      <div className='button-container'>
        <button className='prev-btn' onClick={prevPerson}>
          <FaChevronLeft />
        </button>
        <button className='next-btn' onClick={nextPerson}>
          <FaChevronRight />
        </button>
      </div>
      <button className='randon-btn' onClick={randPerson}>suprise me</button>
    </article>
  )
}

export default Review
