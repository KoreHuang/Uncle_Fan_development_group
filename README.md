#Uncle_Fan_development_group
小伙伴们：在自己电脑上创建自己的分支
ep:git checkout -b ke.huang
创建完成后将自己的分支与小组的分支关联
ep:git push origin ke.huang:ke.huang
关联完成后设置上传路径
ep:git push --set-upstream origin ke.huang
之后大家写的代码就在这个这个私项自己所在的分支里面了 只有咱们小组内的人可以查阅
查阅的前提是别人已经创建分支，并且已经在分支内上传代码，将自己的代码文件
拷贝到Uncle_Fan_development_group里面然后git add.(这里有个点，没有多打)
然后git commit -m "msg"
git push(将自己的分支与远程服务器里面的分支进行合并)
git checkout branch_name可以切换到别人的分支，查看代码共提高（在没有得到别人
允许的时候不要随意修改别人的代码，不然出问题得解决合并冲突）
git checkout 完了之后记得切回自己的分支（**很重要**）
git clone -b branch_name <remote_repo>//命令可以只克隆自己的分支
