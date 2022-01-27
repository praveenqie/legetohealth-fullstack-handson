import React,{Component} from 'react';

export class EmployeeItems extends React.Component{
    constructor(props){
        super(props);
        this.state = {employees : []}
    }
    handleRefress = (event) =>{
        this.setState({
            employees:[{id:100,name:'Alex'},{id:200,name:'Joseph'}]
        });
    }
    render(){
        return (
            <div>
               <h2>Employee Lists</h2>
               <button onClick={this.handleRefress} className='btn btn-primary'>Refresh</button>
               <table className='table table-striped'>
                    <thead><tr>
                        <th>SL no</th><th>Id</th><th>Name</th>
                    </tr>
                    </thead>
                    <tbody>
                        {this.state.employees.map((item,index)=><tr key={item.id}>
                            <td>{index+1}</td>
                            <td>{item.id}</td>
                            <td>{item.name}</td>
                        </tr>)}
                    </tbody>
               </table>
            </div>
        )
    }

} 