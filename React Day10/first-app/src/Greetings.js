import React,{Component} from "react";

export class Hello extends React.Component{
  constructor(props){
      super(props);
  }
  render(){
      return(<div>
    <h2> Hello , {this.props.name} </h2>          
      </div>)
  }
}


class Greetings extends React.Component{
    constructor(props){
        super(props);
    }
    render(){
        return(<div>
      <p> FirstName :{this.props.firstname},LastName : {this.props.lastname} </p>          
        </div>)
    }


} 

export default Greetings;