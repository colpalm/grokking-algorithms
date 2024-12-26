# Simple Hash Map Example

voted = {}


def check_voter(voter_name):
    if voter_name is None or not voter_name.strip():
        raise ValueError("voter_name cannot be null or empty")
    elif voter_name in voted:
        print(f"{voter_name} already voted!!!")
    else:
        voted[voter_name] = True
        print(f"{voter_name} has now voted.")

if __name__ == '__main__':
    check_voter("Tom")
    check_voter("Mark")
    check_voter("Tom")