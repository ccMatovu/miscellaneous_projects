import React from 'react';



const ErrorExample = () => {
  let title = "Random Title";
  const handleClick = ()=>{

  };
  return (
    <React.Fragment>
      <h2>{title}</h2>
      <button type="button" className="btn" onClick={handleClick}>
        change Title
      </button>
    </React.Fragment>
  );
};

export default ErrorExample;
