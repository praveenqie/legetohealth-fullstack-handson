import React,{Component} from "react";


export class Simple extends React.Component{
    handleButton  = (event) =>  {
        console.log('handleButton');
        console.log(event);
    }; render(){
        return (<div>
            <button onClick={(event)=>{console.log(event)}}>Simple Button one</button>
            <button onClick={this.handleButton}>Second button</button>
            </div>)
    };
}
export function Input(){

    return (
      <div>
          <input type='text' onChange={(event)=>{console.log(event)}}></input>
          <button onClick={(event)=>{console.log(event)}}>click2</button>
      </div>  
    )
}
function Button(){
    let handleClick = (event) =>{
        console.log(event);
    }
    return (<div>
        <button onClick={handleClick}>click</button>
    </div>)

}
export default Button;