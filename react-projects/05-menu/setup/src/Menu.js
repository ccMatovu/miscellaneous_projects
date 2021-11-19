import React from 'react';

const Menu = (props) => {
  console.log('the type of = '+typeof props);
  let items = Array.from(props.items);
 // console.log('the itesma are '+items);
  return (
    <div className='section-center'>
      {items.map((menuItem) => {
        const { id, title, img, desc,price } = menuItem
        return (
          <article key={id} className='menu-item'>
            <img src={img} alt={title} className='photo' />
            <div className='item-info'>
              <header>
                <h4>{title}</h4>
                <h4 className='price'>{price}</h4>
              </header>
              <p className='item-text'>{desc}</p>
            </div>
          </article>
        )
      })}
    </div>
  )
};

export default Menu;
