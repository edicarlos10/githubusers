package com.example.network

import com.example.domain.users.model.License
import com.example.domain.users.model.Owner
import com.example.domain.users.model.UserRepos
import com.example.domain.users.model.Users
import com.example.network.base.BaseTest
import com.example.network.remote.IUsersRemoteData
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.RelaxedMockK
import io.reactivex.Single
import org.junit.Test

class UsersRepositoryTest : BaseTest() {

    @RelaxedMockK
    lateinit var remote: IUsersRemoteData

    @InjectMockKs
    lateinit var repository: UsersRepository

    private val usersRemoteData = arrayListOf(
        Users(
            id = 1,
            type = "User",
            avatar_url = "https://avatars.githubusercontent.com/u/1?v=4",
            login = "mojombo",
            name = "mojombo",
            followers = 2,
            following = 2,
            public_repos = 1
        )
    )

    private val userDetailRemoteData =
        Users(
            id = 1,
            type = "User",
            avatar_url = "https://avatars.githubusercontent.com/u/1?v=4",
            login = "mojombo",
            name = "mojombo",
            followers = 2,
            following = 2,
            public_repos = 1
        )

    private val userReposRemoteData = arrayListOf(
        UserRepos(
            allow_forking = true, // true
            archive_url = "https://api.github.com/repos/pjhyett/auto_migrations/{archive_format}{/ref}",
            archived = false, // false
            assignees_url = "https://api.github.com/repos/pjhyett/auto_migrations/assignees{/user}",
            blobs_url = "https://api.github.com/repos/pjhyett/auto_migrations/git/blobs{/sha}",
            branches_url = "https://api.github.com/repos/pjhyett/auto_migrations/branches{/branch}",
            clone_url = "https://github.com/pjhyett/auto_migrations.git",
            collaborators_url = "https://api.github.com/repos/pjhyett/auto_migrations/collaborators{/collaborator}",
            comments_url = "https://api.github.com/repos/pjhyett/auto_migrations/comments{/number}", //
            commits_url = "https://api.github.com/repos/pjhyett/auto_migrations/commits{/sha}", //
            compare_url = "https://api.github.com/repos/pjhyett/auto_migrations/compare/{base}...{head}", //
            contents_url = "https://api.github.com/repos/pjhyett/auto_migrations/contents/{+path}", //
            contributors_url = "https://api.github.com/repos/pjhyett/auto_migrations/contributors", //
            created_at = "2008-03-16T00:44:24Z", //
            default_branch = "master", //
            deployments_url = "https://api.github.com/repos/pjhyett/auto_migrations/deployments", //
            description = "Rails plugin for automating migrations", //
            disabled = false, // false
            downloads_url = "https://api.github.com/repos/pjhyett/auto_migrations/downloads", //
            events_url = "https://api.github.com/repos/pjhyett/auto_migrations/events", //
            fork = false, // false
            forks = 45, // 45
            forks_count = 45, // 45
            forks_url = "https://api.github.com/repos/pjhyett/auto_migrations/forks", //
            full_name = "pjhyett/auto_migrations", //
            git_commits_url = "https://api.github.com/repos/pjhyett/auto_migrations/git/commits{/sha}", //
            git_refs_url = "https://api.github.com/repos/pjhyett/auto_migrations/git/refs{/sha}", //
            git_tags_url = "https://api.github.com/repos/pjhyett/auto_migrations/git/tags{/sha}", //
            git_url = "git://github.com/pjhyett/auto_migrations.git", //
            has_discussions = false, // false
            has_downloads = true, // true
            has_issues = true, // true
            has_pages = true, // true
            has_projects = true, // true
            has_wiki = true, // true
            homepage = "http://errtheblog.com/posts/65-automatically", //
            hooks_url = "https://api.github.com/repos/pjhyett/auto_migrations/hooks", //
            html_url = "https://github.com/pjhyett/auto_migrations", //
            id = 4061, // 4061
            is_template = false, // false
            issue_comment_url = "https://api.github.com/repos/pjhyett/auto_migrations/issues/comments{/number}", //
            issue_events_url = "https://api.github.com/repos/pjhyett/auto_migrations/issues/events{/number}", //
            issues_url = "https://api.github.com/repos/pjhyett/auto_migrations/issues{/number}", //
            keys_url = "https://api.github.com/repos/pjhyett/auto_migrations/keys{/key_id}", //
            labels_url = "https://api.github.com/repos/pjhyett/auto_migrations/labels{/name}", //
            language = "Ruby", //
            languages_url = "https://api.github.com/repos/pjhyett/auto_migrations/languages", //
            license = License(
                key = "mit",
                name = "MIT License",
                node_id  = "MIT License",
                spdx_id = "MIT",
                url = "https://api.github.com/licenses/mit"
            ),
            merges_url = "https://api.github.com/repos/pjhyett/auto_migrations/merges", //
            milestones_url = "https://api.github.com/repos/pjhyett/auto_migrations/milestones{/number}", //
            mirror_url = null, // null
            name = "auto_migrations", //
            node_id = "MDEwOlJlcG9zaXRvcnk0MDYx", //
            notifications_url = "https://api.github.com/repos/pjhyett/auto_migrations/notifications{?since = null,all = null,participating}", //
            open_issues = 1, // 1
            open_issues_count = 11, // 1
            owner = Owner(
                avatar_url = "https://avatars.githubusercontent.com/u/3?v=4",
                events_url = "https://api.github.com/users/pjhyett/events{/privacy}",
                followers_url = "https://api.github.com/users/pjhyett/followers",
                following_url = "https://api.github.com/users/pjhyett/following{/other_user}",
                gists_url = "https://api.github.com/users/pjhyett/gists{/gist_id}",
                gravatar_id = "",
                html_url = "https://github.com/pjhyett",
                id = 1,
                login = "pjhyett",
                node_id = "MDQ6VXNlcjM",
                organizations_url = "https://api.github.com/users/pjhyett/orgs",
                received_events_url = "https://api.github.com/users/pjhyett/received_events",
                repos_url = "https://api.github.com/users/pjhyett/repos",
                site_admin = false,
                starred_url = "https://api.github.com/users/pjhyett/starred{/owner}{/repo}",
                subscriptions_url = "https://api.github.com/users/pjhyett/subscriptions",
                type = "User",
                url = "https://api.github.com/users/pjhyett"
            ),
            private = false,
            pulls_url = "https://api.github.com/repos/pjhyett/auto_migrations/pulls{/number}", //
            pushed_at = "2013-04-25T20:41:57Z", //
            releases_url = "https://api.github.com/repos/pjhyett/auto_migrations/releases{/id}", //
            size = 118, // 118
            ssh_url = "git@github.com:pjhyett/auto_migrations.git", //
            stargazers_count = 146, // 146
            stargazers_url = "https://api.github.com/repos/pjhyett/auto_migrations/stargazers", //
            statuses_url = "https://api.github.com/repos/pjhyett/auto_migrations/statuses/{sha}", //
            subscribers_url = "https://api.github.com/repos/pjhyett/auto_migrations/subscribers", //
            subscription_url = "https://api.github.com/repos/pjhyett/auto_migrations/subscription", //
            svn_url = "https://github.com/pjhyett/auto_migrations", //
            tags_url = "https://api.github.com/repos/pjhyett/auto_migrations/tags", //
            teams_url = "https://api.github.com/repos/pjhyett/auto_migrations/teams", //
            topics = emptyList(),
            trees_url = "https://api.github.com/repos/pjhyett/auto_migrations/git/trees{/sha}", //
            updated_at = "2023-03-03T12:23:57Z", //
            url = "https://api.github.com/repos/pjhyett/auto_migrations", //
            visibility = "public", //
            watchers = 146, // 146
            watchers_count = 146, // 146
            web_commit_signoff_required = false // false
        )
    )

    @Test
    fun `Should return users`() {

        every { remote.getUsers() } returns
                Single.just(usersRemoteData)

        repository.getUsers()
            .test()
            .assertValue(usersRemoteData)
    }

    @Test
    fun `Should return error users`() {
        every {
            remote.getUsers().map {
                throw genericErrorResponse
            }
        } returns
                Single.error(genericErrorResponse)

        repository.getUsers()
            .test()
            .assertError(genericErrorResponse)
    }

    @Test
    fun `Should return user detail`() {
        every { remote.getUserDetail(any()) } returns
                Single.just(userDetailRemoteData)

        repository.getUserDetail("mojombo")
            .test()
            .assertValue(userDetailRemoteData)
    }

    @Test
    fun `Should return error user detail`() {
        every {
            remote.getUserDetail(any()).map {
                throw genericErrorResponse
            }
        } returns
                Single.error(genericErrorResponse)

        repository.getUserDetail("mojombo")
            .test()
            .assertError(genericErrorResponse)
    }

    @Test
    fun `Should return user repos`() {

        every { remote.getUserRepos(any()) } returns
                Single.just(userReposRemoteData)

        repository.getUserRepos("majombo")
            .test()
            .assertValue(userReposRemoteData)
    }

    @Test
    fun `Should return error user repos`() {
        every {
            remote.getUserRepos(any()).map {
                throw genericErrorResponse
            }
        } returns
                Single.error(genericErrorResponse)

        repository.getUserRepos("majombo")
            .test()
            .assertError(genericErrorResponse)
    }
}