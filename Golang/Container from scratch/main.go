// Liz Rice
// goto 2018 Talk on Containers from scratch
//
//

package main

import "os"

// docker 	 	  run image <cmd> <params>
// go run main.go run 		<cmd> <params>

func main(){
	switch os.Args[1]{
	case "run":
		run()
	
	case "child":
		child()

	default:
		panic("bad command")
	}
}

func run(){
	fmt.Printf("Running %v as %d\n", os.Args[2:], os.Getpid())

	cmd := exec.Command("/proc/self/exe", append([]string{"child"}, os.Args[2], os.Args[3:]... )... )
	cmd.Stdin = os.Stdin
	cmd.Stdout = os.Stdout
	cmd.Stderr = os.Stderr
	cmd.SysProcAttr = &syscall.SysProcAttr{
		Cloneflags: syscall.CLONE_NEWUTS | syscall.CLONE_NEWPID,
	}

	cmd.Run()

}

func child(){
	fmt.Printf("Running %v as %d\n", os.Args[2:], os.Getpid())

	cmd := exec.Command(os.Args[2], os.Args[3:]...)
	cmd.Stdin = os.Stdin
	cmd.Stdout = os.Stdout
	cmd.Stderr = os.Stderr
	cmd.SysProcAttr = &syscall.SysProcAttr{
		Cloneflags: syscall.CLONE_NEWUTS, 
	}
	syscall.Sethostname([]byte("container"))
	syscall.Chroot("/vagrant/ubuntu-fs") // ubuntu-fs
	syscall.Chdir("/")
	syscall.Mount("proc", "proc", "proc, 0, ")

	cmd.Run()

	// finished
	syscall.Unmount("/proc", 0)
}


func must(err error){
	if err != nil{
		panic(err)
	}
}